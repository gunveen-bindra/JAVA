public class Array_sort{
public static void main(String[] args){
Sort obj = new Sort();
obj.ascending();
}
}

class Sort{
String temp;
String array[] = {"A","C","D","B"};
int size = array.length;
void ascending(){
System.out.println("Ascending Order");
for (int i=0;i < size;i++)
{
for (int j = i+1;j < size;j++)
{
if (array[j].compareTo(array[i]) < 0 )
{
temp = array[i];
array[i] = array[j];
array[j] = temp;
}
}
}

for (int i = 0 ;i < size;i++)
{
System.out.println(array[i]);
}
}
}

