import random

#plan
#Ask the user to make a choice
#If choice is not valid
#   Print an error message
#Let the computer make a move (choice)
#print the choices selected
#determine the winner
#ask the user if they want to play again
#if not --> terminate

play = True

choices = ['r', 'p', 's']

while play:
    user_choice = input('Rock, Paper, or Scissors? (r,p,s) ').lower()
    if user_choice not in choices:
        print('INVALID CHOICE')
    computer_choice = random.choice(choices)
    if user_choice == 'r':
        print('rock')
    elif user_choice == 's':
        print('scissors')
    else:
        print('paper')
    print(f'You chose {user_choice}')
    print(f'Computer chose {computer_choice}')
    if input('do you want to play again? yes or no') == 'no':
        play = False
    
        
