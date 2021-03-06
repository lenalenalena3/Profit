#language:ru
  Функционал: Проверка расчета дохода по вкладу Сохраняй

    Предыстория:
      Дано открыт браузер и осуществлен переход по ссылке

    @123
  Сценарий: Проверка расчета дохода по вкладу Сохраняй
    * начинается тест "Проверка расчета дохода по вкладу Сохраняй"
    * пользователь открывает раздел "Раздел Вложить и заработать"
    * пользователь открывает меню "Вклад Сохраняй"
    * пользователь устанавливает валюту "ЕВРО"
    * пользователь устанавливает срок вклада "365"
    * пользователь устанавливает сумму вклада "60000"
    * пользователь устанавливает параметр "Капитализация процентов" значением "Нет"
    * пользователь устанавливает параметр "Досрочное закрытие вклада" значением "Нет"
    * пользователь устанавливает параметр "Вкладчик - пенсионер" значением "Да"
    * нажимает кнопку "Рассчитать"
    * параметр "Средний доход за 30 дней " равен "0,50 €"
    * параметр "Базовая процентная ставка " равен "0,01%"
    * пользователь закрывает браузер

    @124
    Сценарий: Проверка расчета дохода по вкладу Сохраняй для рублей
     * начинается тест "Проверка расчета дохода по вкладу Сохраняй для рублей"
     * пользователь открывает раздел "Раздел Вложить и заработать"
     * пользователь открывает меню "Вклад Сохраняй"
     * пользователь устанавливает валюту "РОССИЙСКИЙ РУБЛЬ"
     * пользователь устанавливает срок вклада "365"
     * пользователь устанавливает сумму вклада "60000"
     * пользователь устанавливает параметр "Капитализация процентов" значением "Нет"
     * пользователь устанавливает параметр "Досрочное закрытие вклада" значением "Нет"
     * пользователь устанавливает параметр "Вкладчик - пенсионер" значением "Да"
     * нажимает кнопку "Рассчитать"
     * параметр "Средний доход за 30 дней " равен "217,50 р."
     * параметр "Базовая процентная ставка " равен "4,35%"
     * пользователь закрывает браузер
