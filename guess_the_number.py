import random

#create random number outside of loop
prize_number = random.randint(1, 100)

#plan:
#If not a valid number
#   print an error message
#If number < guess
#   print too low!
#If number > guess
#   print too high!
#Else
#   Print well done!

while True:
    try:
        guess = int(input('Guess the number between 1 and 100! if you can... '))

        if guess < prize_number:
            print('too low!')
        elif guess > prize_number:
            print('too high!')
        else:
            print('Congrats! you did it!')
            break
    except ValueError:
        print('please enter a valid number')

            


