package com.mimaraslan;

import com.mimaraslan.dao.AgentDAO;
import com.mimaraslan.dao.BuyerDAO;
import com.mimaraslan.dao.PropertyDAO;
import com.mimaraslan.dao.SellerDAO;
import com.mimaraslan.model.Agent;
import com.mimaraslan.model.Buyer;
import com.mimaraslan.model.Property;
import com.mimaraslan.model.Seller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class AppMain {

    public static void main(String[] args) {

        AgentDAO agentDAO = new AgentDAO();
        PropertyDAO propertyDAO = new PropertyDAO();
        SellerDAO sellerDAO = new SellerDAO();
        BuyerDAO buyerDAO = new BuyerDAO();

        Agent agent = new Agent();
        agent.setAgentName("Salih Emlak");
        agent.setPhone("123456789");
        agent.setEmail("salihemalak123@abc.com");
        agent.setOfficeAddress("Kartal Java");
        agentDAO.saveOrUpdate(agent);

        Agent agent2 = new Agent();
        agent2.setAgentName("Batuhan Emlak");
        agent2.setPhone("12348888");
        agent2.setEmail("batuhanemalak123@abc.com");
        agent2.setOfficeAddress("Maltepe");
        agentDAO.saveOrUpdate(agent2);


        Buyer buyer = new Buyer();
        buyer.setFirstName("Ebru");
        buyer.setLastName("Çınar");
        buyer.setEmail("abc@aaa.com");
        buyer.setPhone("3333");
        buyerDAO.saveOrUpdate(buyer);

        Buyer buyer2 = new Buyer();
        buyer2.setFirstName("Banu");
        buyer2.setLastName("Nur");
        buyer2.setEmail("yyyy@aaa.com");
        buyer2.setPhone("444");
        buyerDAO.saveOrUpdate(buyer2);



        Seller seller = new Seller();
        seller.setFirstName("Ali");
        seller.setLastName("Yağız");
        seller.setEmail("dddd@aaa.com");
        seller.setPhone("8888");
        sellerDAO.saveOrUpdate(seller);

        Seller seller2 = new Seller();
        seller2.setFirstName("Ecem");
        seller2.setLastName("Koro");
        seller2.setEmail("tttt@aaa.com");
        seller2.setPhone("233252");
        sellerDAO.saveOrUpdate(seller2);


        Property property = new Property();
        property.setPropertyName("Nedim Bey Malikanesi");
        property.setTitle("Dublex");
        property.setDescription("Nezih bir ortam. Dileğinizin kabul olacağı ortam.");
        property.setType("Kiralık");
        property.setBathroom(3);
        property.setBedroom(15);
        property.setPrice(BigDecimal.valueOf(10_000_000.75));
        property.setArea(450.66F);
        property.setLocation("Çengelköy");
        // ilişki
        property.setAgent(agent);
        property.setSeller(seller);
        property.getBuyers().add(buyer);
        property.getBuyers().add(buyer2);

        // INSERT SAVE CREATE
        propertyDAO.saveOrUpdate(property);


        // UPDATE
        property.setType("Satıldı");
        propertyDAO.saveOrUpdate(property);



        Property property2 = new Property();
        property2.setPropertyName("Doğan");
        property2.setTitle("Hotel");
        property2.setDescription("Turistik belde");
        property2.setType("Satış");
        property2.setBathroom(20);
        property2.setBedroom(40);
        property2.setPrice(BigDecimal.valueOf(200_000_000.55));
        property2.setArea(650.22F);
        property2.setLocation("Antalya");

        // ilişkiler 1 - m
        property2.setAgent(agent2);
        property2.setSeller(seller2);

        // ilişkiler m - m
        property2.getBuyers().add(buyer);
        property2.getBuyers().add(buyer2);

        propertyDAO.saveOrUpdate(property2);


        System.out.println("Agent");
        List<Agent> agents = agentDAO.getAgentsFindAll();

        for (Agent a : agents ) {
            System.out.println(a.getId() + " "+ a.getAgentName() +  " " + a.getEmail());
        }

        System.out.println("-----------------------");

        System.out.println("Seller");
        List<Seller> sellers =  sellerDAO.getSellersFindAll();

        for (Seller s : sellers ) {
            System.out.println(s.getId() + " "+  s.getFirstName() +  " " + s.getLastName());
        }

        System.out.println("-----------------------");

        System.out.println("Buyer");

        // DELETE
        // buyerDAO.deleteBuyerFindById(1L);

        List<Buyer> buyers = buyerDAO.getBuyersFindAll();

        for (Buyer b : buyers ) {
            System.out.println(b.getId() + " "+  b.getFirstName() +  " " + b.getLastName());
        }


        System.out.println("\n\nBuyer 1 ");
        Buyer buyerObj = buyerDAO.getBuyerFindById(1L);
        System.out.println(buyerObj.getId() + " " + buyerObj.getFirstName() +  " " + buyerObj.getLastName());


        System.out.println("-----------------------");

        List<Seller> allSellers = sellerDAO.getSellersFindAll();
        System.out.println(allSellers);

        for (Seller s : allSellers ) {
            System.out.println(s.getId() +" " + s.getFirstName() +  " " + s.getLastName());
        }







    }


}