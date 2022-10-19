Feature: US1011ClassWork
  Scenario: Herocap sitesi buton tarama

    And "https://the-internet.herokuapp.com/add_remove_elements/"  adresine gidin
    And "Add Element" butona basin
    And "Delete" butonu gorunur oluncaya kadar bekleyin
    And "Delete" butonunun gorunur oldugunu test edin
    And Delete butonuna basarak butonu silin
    And Delete butonunun gorunmedigini test edin