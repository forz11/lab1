import scala.util.Random

object lab1 extends App {

  // Генерируем случайные числа
  val random = new Random
  val numbers: List[Double] = List.fill(20)(random.nextDouble() * 100) // Генерируем 20 случайных чисел от 0 до 100

  // Выводим сгенерированный список
  println(s"Сгенерированный список: $numbers")

  // Находим среднее значение списка
  val average: Double = numbers.sum / numbers.length

  // Находим количество элементов, отличающихся от среднего на 5
  val diffBy5Count: Int = numbers.count(num => Math.abs(num - average) > 5)

  // Выводим результат
  println(s"Среднее значение списка: $average")
  println(s"Количество элементов, отличающихся от среднего на 5: $diffBy5Count")
}
