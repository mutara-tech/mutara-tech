import math

# Variables
example = 123
print(f'example as an integer: {example}')
print(type(example))

example = float(example)
print(f'example as a float: {example}')
print(type(example))

example = str(round(example))
print(f'example as a string: {example}')
print(type(example))

example = bool(example)
print(f'example as a boolean: {example}')
print(type(example))

# Mathmatics
a, b, c = 123, 456, 789
print(f'{c + b - a:,}')
print(f'{c / b * a:,.2f}')
print(f'{c ** b // a:,}')
print(f'{c % b:,}')
print(f'{b % a:,}')

# More math
a = 0
b = 3.14
c = 4
d = 5

a = a + 1
a += 1  # augmented assignment operators
a = a - 2
a -= 2
a = a * 3
a *= 3
print(a)

print(round((a + b + c + d), 2))  # Rounding off
print(abs(a), abs(b), abs(c), abs(d))  # Absolute value
print(pow(a, 2), pow(a, 2), pow(c, 2), pow(d, 2))  # Power of

print(math.pi)
print(math.e)
print(math.ceil(b))  # Rounds float up
print(math.log(b, 2))

# IF statements - decision-making statements
# ELIF
# ELSE
# Logical operators - and, or, not
# String methods, len, find, rfind, strip, split, upper, title...