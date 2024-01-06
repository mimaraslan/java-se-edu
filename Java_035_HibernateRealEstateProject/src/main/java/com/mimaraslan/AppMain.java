package com.mimaraslan;

import com.mimaraslan.dao.AgentDAO;
import com.mimaraslan.dao.BuyerDAO;
import com.mimaraslan.dao.PropertyDAO;
import com.mimaraslan.dao.SellerDAO;
import com.mimaraslan.model.Agent;
import com.mimaraslan.model.Buyer;
import com.mimaraslan.model.Property;
import com.mimaraslan.model.Seller;

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
        property.setTitle("Dublex");
        property.setDescription("10 odalı 3 banyolu");
        property.setType("Kiralık");

        // ilişki

        propertyDAO.saveOrUpdate(property);


    }


}