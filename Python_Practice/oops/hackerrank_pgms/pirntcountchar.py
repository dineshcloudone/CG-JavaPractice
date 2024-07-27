
input_str = "aaabbbcccddefffaa"

output_str = ""
prev_char = ""
char_count = 0

for char in input_str:
    if char != prev_char:
        if prev_char:
            output_str += prev_char + str(char_count)
        prev_char = char 
        char_count = 1
    else:
        char_count += 1

output_str += prev_char + str(char_count)

print(output_str)
