# SI_2025_lab2_233063
Pavel Petkovski 233063

![cfg](https://github.com/user-attachments/assets/1be24b9a-bcd1-4219-a332-b7073308951e)

3) Цикломатската комплексност изнесува 9, а се добива со броење на точките кај што има раздвојување на патот(true или false) кои се 8 на број, и се додава 1 за базичниот пат. 

4 )Null листа
checkCart(null, "1234567890123456")

Валидна листа без попуст
List<Item> items = List.of(new Item("Item", 1, 1000, 0.0));
checkCart(items, "1234567890123456")

Discount со sum=-30
List<Item> items = List.of(new Item("Item", 5, 350, 0.2));
checkCart(items, "1234567890123456")

Невалиден број на картичка
List<Item> items = List.of(new Item("Item", 2, 100, 0.0));
checkCart(items, "1234ABCD5678EFGH")

Со овие 4 тест случаи се покриваат:
сите if гранки, сите throw statements,
sum +=, sum-=, што го задоволува Every Statement критериумот.


5) Ниеден случај не важи
List<Item> items = List.of(new Item("Item", 1, 100, 0.0));
checkCart(items, "1234567890123456");

Само цената е повисока
List<Item> items = List.of(new Item("Item", 1, 350, 0.0));
checkCart(items, "1234567890123456");

Само има попуст 
List<Item> items = List.of(new Item("Item", 1, 100, 0.1));
checkCart(items, "1234567890123456");

Само количината е поголема
List<Item> items = List.of(new Item("Item", 11, 100, 0.0));
checkCart(items, "1234567890123456");

Цена и попуст
List<Item> items = List.of(new Item("Item", 1, 400, 0.2));
checkCart(items, "1234567890123456");

Цена и количина
List<Item> items = List.of(new Item("Item", 11, 400, 0.0));
checkCart(items, "1234567890123456");

Попуст и количина
List<Item> items = List.of(new Item("Item", 11, 100, 0.1));
checkCart(items, "1234567890123456");

Сите услови се вистинити
List<Item> items = List.of(new Item("Item", 15, 400, 0.1));
checkCart(items, "1234567890123456");


