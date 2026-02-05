import random

#Steps:
#Ask the user: roll the dice?
#if user says yes: generate two random numbers between 1 and 6 --> print them
#if user says no: print --> thank you message then terminate
#else: print --> invalid choice

while True:
    choice = input('Roll the dice? (yes/no): ').lower()
    if choice == 'yes':
        die1 = random.randint(1, 6)
        die2 = random.randint(1, 6)
        print(f'({die1}, {die2})')
    elif choice == 'no':
        print('Thanks for playing!')
        break
    else:
        print('Invalid choice!')

        
