1) Сборка на Maven с помощью команды mvn spring-boot:run
2) запрос POST по адресу http://localhost:8080/api/postdata
3) Ожидаемое cодержимое JSON на вход:
   {
   "companyName": "Quality Expert",
   "candidate": "Валерия",
   "month": "декабрь"
   }