import java.net.http.HttpClient
import java.net.http.HttpResponse

fun main() {
        // Определяем варианты ответа
        val options = listOf(
            "1. USDT - RUB",
            "2. RUB - USDT",
            "3. RUB - KZT",
            "4. KZT - RUB"
        )

        // Выводим варианты на консоль
        println("Что необходимо конвертировать?:")
        options.forEach { println(it) }

        // Считываем выбор пользователя
        val userInput = readLine()

        // Обрабатываем выбор пользователя
        when (userInput) {
            "1" -> println("Вы выбрали конвертацию USD - RUB")
            "2" -> println("Вы выбрали конвертацию RUB - USD")
            "3" -> println("Вы выбрали конвертацию RUB - KZT")
            "4" -> println("Вы выбрали конвертацию KZT - RUB")
            else -> println("Неверный выбор. Пожалуйста, выберите вариант от 1 до 4.")
        }
        println("Укажите количество")

        // Считываем ввод пользователя
        val inputData = readLine()

        // Проверяем, что введенное значение не null и может быть преобразовано в Int
        val value = inputData!!.toInt()


        if (userInput == "1") {
            val value = inputData.toDouble()
            val result = value * 30
            println("Результат конвертации: ${result} рублей")
        } else if (userInput == "2") {
            val value = inputData.toInt()
            val result = value / 30
            println("Результат конвертации: $result долларов")
        } else if (userInput == "3") {
            val value = inputData.toInt()
            val result = value * 5
            println("Результат конвертации: $result тенге")
        } else {
            val value = inputData.toInt()
            val result = value / 5
            println("Результат конвертации: $result рублей")
            }
    }



