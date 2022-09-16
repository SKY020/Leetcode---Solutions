int count =0;
String temp = Integer.toString(n);
int[] numbers = new int[temp.length()];
for (int i = 0; i < temp.length(); i++) {
numbers[i] = temp.charAt(i);
}
for(int i=0;i<=numbers.length;i++){
if(numbers[i]==1)
count++;
}
return count;