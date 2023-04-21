## Задание по курсу QA Mobile, модуль "Введение в Kotlin"

### Задача 1
#### FirstTaskExtensionFunction
Реализована функция-расширение для работы с коллекцией MutableList, содержащей в себе тип Int.  
Функция возводит все элементы коллекции в квадрат, при переполнении типа Int
выводит соответствующее сообщение.
#### FirstTaskTest
В тестах проверяется корректность возведения в квадрат различных, в т.ч. граничных значений и корректность сообщения
при переполнении Int.

### Задача 2
#### SecondTaskTypeConversion
Реализован метод, который может принимать в себя объекты типа Any?  
Исходя из того к какому типу принадлежит переданный объект, выполняет соответствующее действие.
#### SecondTaskTest
Реализованы тесты на все типы данных, для которых предусмотрены действия в методе.

### Задача 3
#### ThirdTaskChainOperations
Реализован метод, принимающий в себя коллекцию MutableList с числами типа Double?  
После цепочки операций преобразования и фильтрации возвращает сумму элементов в оставшейся коллекции. 
#### ThirdTaskTest
Реализованы тесты с различными входными данными.

### Задача 4
#### ForthTaskStringTemplates
Реализован метод который принимает натуральные числа в диапазоне 1..1000 и выводит на печать
полученное число русскими словами.  
Для реализации метода были созданы списки слов обозначающих цифры.  
Использована вспомогательная функция `countDigits` которая разбивает число на разряды и возвращает список
из трех целых чисел.
Числа в переданном списке в дальнейшем используются как индексы для выбора слов в конструкторе названия числа.
#### ForthTaskTest
Реализованы тесты с различными входными данными.

### Services
Учитывая что в большинстве тестов нужно проверить корректность вывода на печать, реализована вспомогательная
функция `captureOutput`, которая считывает вывод из консоли и возвращает его в виде строки.
