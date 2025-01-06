import random

def play_game():
    max_attempts = 10
    rounds_played = 0
    rounds_won = 0
    
    while True:
        number_to_guess = random.randint(1, 100)
        attempts = 0
        print("\nI have selected a number between 1 and 100. Can you guess what it is?")

        while attempts < max_attempts:
            guess = input(f"Attempt {attempts + 1}/{max_attempts}: Enter your guess: ")
            try:
                guess = int(guess)
            except ValueError:
                print("Please enter a valid number.")
                continue

            attempts += 1

            if guess < number_to_guess:
                print("Too low!")
            elif guess > number_to_guess:
                print("Too high!")
            else:
                print("Congratulations! You've guessed the correct number!")
                rounds_won += 1
                break

        if attempts == max_attempts and guess != number_to_guess:
            print(f"Sorry, you've used all {max_attempts} attempts. The correct number was {number_to_guess}.")

        rounds_played += 1
        print(f"Rounds played: {rounds_played}, Rounds won: {rounds_won}")
        
        play_again = input("Would you like to play another round? (yes/no): ").lower()
        if play_again != 'yes':
            print("Thanks for playing!")
            break

play_game()
