$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scenario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:ru"
    }
  ],
  "line": 2,
  "name": "Проверка расчета дохода по вкладу Сохраняй",
  "description": "",
  "id": "проверка-расчета-дохода-по-вкладу-сохраняй",
  "keyword": "Функционал"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Предыстория"
});
formatter.step({
  "line": 5,
  "name": "открыт браузер и осуществлен переход по ссылке",
  "keyword": "Дано "
});
formatter.match({
  "location": "Step.openBrowser()"
});
formatter.result({
  "duration": 7793025191,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Проверка расчета дохода по вкладу Сохраняй",
  "description": "",
  "id": "проверка-расчета-дохода-по-вкладу-сохраняй;проверка-расчета-дохода-по-вкладу-сохраняй",
  "type": "scenario",
  "keyword": "Сценарий",
  "tags": [
    {
      "line": 6,
      "name": "@123"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "пользователь открывает раздел \"Раздел Вложить и заработать\"",
  "keyword": "Когда "
});
formatter.step({
  "line": 9,
  "name": "пользователь открывает меню \"Вклад Сохраняй\"",
  "keyword": "И "
});
formatter.step({
  "line": 10,
  "name": "пользователь устанавливает валюту \"ЕВРО\"",
  "keyword": "И "
});
formatter.step({
  "line": 11,
  "name": "пользователь устанавливает срок вклада \"365\"",
  "keyword": "И "
});
formatter.step({
  "line": 12,
  "name": "пользователь устанавливает сумму вклада \"60000\"",
  "keyword": "И "
});
formatter.step({
  "line": 13,
  "name": "пользователь устанавливает параметр \"Капитализация процентов\" значением \"Нет\"",
  "keyword": "И "
});
formatter.step({
  "line": 14,
  "name": "пользователь устанавливает параметр \"Досрочное закрытие вклада\" значением \"Нет\"",
  "keyword": "И "
});
formatter.step({
  "line": 15,
  "name": "пользователь устанавливает параметр \"Вкладчик - пенсионер\" значением \"Да\"",
  "keyword": "И "
});
formatter.step({
  "line": 16,
  "name": "нажимает кнопку Рассчитать",
  "keyword": "И "
});
formatter.step({
  "line": 17,
  "name": "параметр \"Средний доход за 30 дней \" равен \"0,50 €\"",
  "keyword": "Тогда "
});
formatter.step({
  "line": 18,
  "name": "параметр \"Базовая процентная ставка \" равен \"0,01%\"",
  "keyword": "Тогда "
});
formatter.step({
  "line": 19,
  "name": "пользователь закрывает браузер",
  "keyword": "И "
});
formatter.match({
  "arguments": [
    {
      "val": "Раздел Вложить и заработать",
      "offset": 31
    }
  ],
  "location": "Step.openCharter(String)"
});
formatter.result({
  "duration": 1503621335,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Вклад Сохраняй",
      "offset": 29
    }
  ],
  "location": "Step.openMenu(String)"
});
formatter.result({
  "duration": 2718780467,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ЕВРО",
      "offset": 35
    }
  ],
  "location": "Step.setCurrency(String)"
});
formatter.result({
  "duration": 1346118121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "365",
      "offset": 40
    }
  ],
  "location": "Step.setDays(String)"
});
formatter.result({
  "duration": 553145409,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60000",
      "offset": 41
    }
  ],
  "location": "Step.setSum(String)"
});
formatter.result({
  "duration": 325321526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Капитализация процентов",
      "offset": 37
    },
    {
      "val": "Нет",
      "offset": 73
    }
  ],
  "location": "Step.setValueRadiobox(String,String)"
});
formatter.result({
  "duration": 212468571,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Досрочное закрытие вклада",
      "offset": 37
    },
    {
      "val": "Нет",
      "offset": 75
    }
  ],
  "location": "Step.setValueRadiobox(String,String)"
});
formatter.result({
  "duration": 209031342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Вкладчик - пенсионер",
      "offset": 37
    },
    {
      "val": "Да",
      "offset": 70
    }
  ],
  "location": "Step.setValueRadiobox(String,String)"
});
formatter.result({
  "duration": 183478692,
  "status": "passed"
});
formatter.match({
  "location": "Step.clickButtonCalc()"
});
formatter.result({
  "duration": 187101093,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Средний доход за 30 дней ",
      "offset": 10
    },
    {
      "val": "0,50 €",
      "offset": 44
    }
  ],
  "location": "Step.assertFactPlan(String,String)"
});
formatter.result({
  "duration": 170015645,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Базовая процентная ставка ",
      "offset": 10
    },
    {
      "val": "0,01%",
      "offset": 45
    }
  ],
  "location": "Step.assertFactPlan(String,String)"
});
formatter.result({
  "duration": 103941164,
  "status": "passed"
});
formatter.match({
  "location": "Step.closeBrowser()"
});
formatter.result({
  "duration": 1291556391,
  "status": "passed"
});
});