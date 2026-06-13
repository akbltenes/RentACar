# Rent A Car Project

Bu proje, bir araç kiralama sisteminin backend altyapısını oluşturmak amacıyla **Spring Boot** kullanılarak geliştirilmiştir. Proje, sürdürülebilirlik ve genişletilebilirlik için **Katmanlı Mimari (N-Tier Architecture)** prensiplerine uygun olarak tasarlanmıştır.

## Technologies Used

* Java 23
* Spring Boot
* Spring Data JPA
* ModelMapper (Entity-DTO Mapping)
* Maven
* Lombok
* RESTful API

## Project Structure

```text
rentACar/
├── src/
│   ├── main/
│   │   ├── java/enes/akblt/rentACar/
│   │   │   ├── business/               # İş mantığı (Business Logic)
│   │   │   │   ├── abstracts/          # Servis arayüzleri
│   │   │   │   ├── concretes/          # Servis implementasyonları
│   │   │   │   ├── requests/           # API'ye gelen veri modelleri (DTO)
│   │   │   │   └── responses/          # API'den dönen veri modelleri (DTO)
│   │   │   ├── core/utilities/mappers/ # ModelMapper yapılandırması
│   │   │   ├── dataAccess/abstracts/   # Veritabanı erişim katmanı (Repository)
│   │   │   ├── entities/concretes/     # Veritabanı tabloları (Entities)
│   │   │   └── webApi/controllers/     # REST API uç noktaları (Endpoints)
│   │   └── resources/
│   │       └── application.properties  # Uygulama yapılandırmaları
│   └── test/                           # Test dosyaları
├── .mvn/                               # Maven Wrapper
├── mvnw
├── mvnw.cmd
└── pom.xml                             # Bağımlılık yönetimi
