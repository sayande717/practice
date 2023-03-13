# 1. Open a file, create a file handle. It's like setting up a buffer for the file.
# f = open('file.ext','r')
# 2nd argument:
# 'r' = Open a file for reading
# 'w' = Create a new file, write to it.
# 'a' = Append to an existing file.

# 2. Read from a file
# contents = fh.read() - Read entire file, as a single string.
# contents = fh.readLine() - Read one line, including the '\n' character at last.
# contents = fh.readLines() - Read the entire file as a list of strings
# fh.seek(n) - Move pointer to position 'n'.
# fh.read(12) - Read a fixed number of characters, from the current position.

# 3. Write to a file 
# fh.write(str) - Write the string 'str' to the file.
# fh.writelines(l) - Write a number of lines l to the file. Use '\n' explicitly to signify a new line.

# 4. Close a file.
# fh.close()

file = open('file.txt','w')
for i in range(101):
    file.write(str(i)+'\n')
file.close()

file = open('file.txt',mode='r')
print(file.read())
file.close()