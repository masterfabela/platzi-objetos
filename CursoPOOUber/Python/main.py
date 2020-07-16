from car import Car
from account import Account

if __name__ == "__main__":
  print("hola mundo")
  car = Car("AMS234", Account("Andres Herrera","768564G"))
  print(vars(car))

  car2 = Car("QWE567", Account("Martha", "764565F"))
  print(vars(car2))