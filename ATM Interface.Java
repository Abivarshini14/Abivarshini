class BankAccount:
    def __init__(self, initial_balance=0):
        self.balance = initial_balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            return True
        return False

    def withdraw(self, amount):
        if 0 < amount <= self.balance:
            self.balance -= amount
            return True
        return False

    def check_balance(self):
        return self.balance


class ATM:
    def __init__(self, account):
        self.account = account

    def withdraw(self, amount):
        if self.account.withdraw(amount):
            print(f"Withdrawal successful! New balance: ${self.account.check_balance():.2f}")
        else:
            print("Insufficient balance or invalid amount. Please try again.")

    def deposit(self, amount
