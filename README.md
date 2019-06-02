The purpose of this project is to decrypt ciphers that encodes using an alias
for each letter of the alphabet. Part of the goal of this is to demonstrate the 
length of time it takes for a program to crack such ciphers. The main idea, which
has been known for quite some time, is to match up the frequency of the occurance of
each letter in the coded message with the frequency of the occurance of letters in 
English. This provided, in testing cases, a close approximation of which letter matches
with which letter. Consider a case where a set of English words was fed into the decrypter.

e corresponds to e with frequency 8.993448481238833
t corresponds to t with frequency 8.695652173913043
o corresponds to a with frequency 6.789755807027993
a corresponds to o with frequency 6.194163192376415
i corresponds to i with frequency 5.77724836212031
s corresponds to n with frequency 5.717689100655152
h corresponds to s with frequency 4.586063132817153
n corresponds to r with frequency 4.3478260869565215
l corresponds to h with frequency 4.050029779630733
u corresponds to d with frequency 3.8117927337701016
r corresponds to l with frequency 3.4544371649791543
d corresponds to u with frequency 2.6801667659321025
g corresponds to c with frequency 2.084574151280524
m corresponds to m with frequency 1.9654556283502083
c corresponds to f with frequency 1.9654556283502083
y corresponds to y with frequency 1.9058963668850508
f corresponds to w with frequency 1.846337105419893
p corresponds to g with frequency 1.429422275163788
w corresponds to p with frequency 1.36986301369863
b corresponds to b with frequency 1.0720667063728408
v corresponds to v with frequency 0.8338296605122096
k corresponds to k with frequency 0.6551518761167362
j corresponds to x with frequency 0.29779630732578916
x corresponds to q with frequency 0.1786777843954735
q corresponds to j with frequency 0.1786777843954735
z corresponds to z with frequency 0.05955926146515784

This should be enough to try a few combinations of probable letters and quickly see if it will 
be possible to decrypt the cipher text. Of course if the text was not encrypted using the alias
method then it will not be possible to decrypt the text. 
