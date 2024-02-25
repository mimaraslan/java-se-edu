# MONOLITHIC
* Bütün bileşenleriniz tek bir büyük paket halindedir. 
* Bütün proje tek bir dil ile yada yapı ile geliştirilmek zorunda.
* Birlikte çalışma kültürüyle geliştirilmesi daha zordur.
* Genellikle bir tane veritabanı sunucusu olur ve uygulama direkt olarak ona bağlı çalışır.
* Ölçeklendirme(scalebility) kolay değildir.
* Basit bir şekilde dağıtım ve geliştirme süreci gerçekleştirilir.

# MICROSERVICES:
* Uygulama daha küçük ve birbirinden bağımsız parçalara ayrılır.
* Her bir yapı farklı bir dil ile yazılabilir.
* Birlikte çalışma kültürüne daha uygundur.
* Her bir yapı farklı veritabanları kullanır.
* İçerisinde ekstra bir çok yeni teknoloji barındırır.
* Birbirleriyle iletişim kurarken mesajlaşma sistemleri kullanırlar.
* Daha kolay ölçeklendirilebilir.
* Dağıtım, geliştirme gibi süreçler daha karmaşıktır.

# SANALLAŞTIRMA
* Kendi bilgisayarınız üzerinde başka bilgisayarlar kurmanıza yardımcı olan sistemlerdir.
* HOST BİLGİSAYAR: Sanallaştırmanın yapılacağı bilgisayar demektir.
* VM-Virtual Machine: Host üzerine kurulmuş sanal makinalardır.

# CONTAINERIZATION
* Sanallaştırma teknolojisi çeşididir.
* İçindeki kurulan yapılar birbirinden izole bir biçimde çalışır. 
* Bağımsız konteynarlar içerir.
* Konteynarların taşınması çok kolaydır. Burada taşınma işlemi cloud üzerinden de rahatlıkla
* gerçekletirilir.
* Çok daha az kaynak tüketirler.
* Çok daha hızlı başlatılırlar.
* Ölçeklendirmesi çok çok daha kolaydır.

# DOCKER
* Go diliyle yazılmıştır. 2013 yılında geliştirilmiştir.
* Paketleme, hem dağıtım, hem de çalıştırma imkanı sağlayan bir platformdur.
* İçerisinde onlarca dahili imaj barındırır.
* Mikroservis mimarisinin gelişimiyle beraber popülerliği artmıştır.
* Docker kendi içinde dahili küçük boyutta linux çekirdeği barındırır. (KERNEL)

# Bir uygulamanın DEPLOY edilme aşamaları ( JAR OLUŞTURMA )
* gradle paneli ile build al.
* gradle paneli ile buildDependents al.
* projemizde build klasörü içinde libs klasörü içinde oluşan jar dosyasını alabilirsin.
* çalıştırmak için jar dosyasına çift tıkla.

# Docker Engine:
* Arka planda konteyları oluşturan, yönetimini sağlayan ve çalıştırma gibi temel 
* işlevleri yerine getiren yapıdır.

# Docker CLI:
* komutlarımız CLI aracılığyla docker'a iletilir.

# Docker Image
* Bir uygulamanın çalışması için gerekli tüm dosyalar, bağımlılıklar ve yapılandırmaları içerir.
* Image dosyası sabit diskte yer kaplar.

# Docker Container:
* Docker Image'in çalışır halidir.
* Çalışma anında gerçekleştirilen değişiklikler korunmaz. 
* Kapanınca kaybolur.
* Değişiklikleri saklamak için VOLUME'lerden yararlanabilirsiniz. (Vt için)
* Veya container'in o anki halinden yeni bir imaj dosyası oluşturabilirsiniz.



```
docker run --name my-postgresdb -e POSTGRES_PASSWORD=123456789 -d -p 9999:5432 postgres
```

```
docker run -d -p 9411:9411 --memory=256m  openzipkin/zipkin
```

```
docker run -d --hostname my-rabbit --name my-rabbit -e RABBITMQ_DEFAULT_USER=user -e RABBITMQ_DEFAULT_PASS=user -p 15672:15672 -p 5672:5672  --memory=512m rabbitmq:3.13.0-management
```