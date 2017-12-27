public class ExampleLinkedList{
   public static void main(String[] args){
        
        List linledList = new LinkedList<>(); //without object type declaration 
        
        linledList.add(3);       //In Collections we can add any type of data ,we can add and delete any time
        linledList.add(3.4);
        linledList.add(true);
        linledList.add("string");
        linledList.add(3);
        
        System.out.println(linledList); //[3,3.4,true,string,3] //data will store in indexex
        
        //another type of creating arraylist class
        
        List <object> linledList1 = new LinkedList<object>(); //Object is a super class of classes, here object is type of data
                                                      //same as above method but if we declare a class without type declaration its give a warring
        linledList1.add(3);
        linledList1.add(3.4);
        linledList1.add(true);
        linledList1.add("string");
        linledList1.add(3);
        
        System.out.println(linledList1);
        
        //one  more type of creation
        
        List <Integer> linledList2 = new LinkedList<Integer>(); //here Integer is class not an primitive. In collection we work with objects and classes not with primitivites
                                                              // if we declare a list as Integer its only allow to stroe integer values it cannot store other type of values if we store its give an compile time error
        linledList2.add(3);
        linledList2.add(4);
        linledList2.add(true);//compiletime eeror becuse its a boolean value
        linledList2.add(5);
        linledList2.add(6);
        System.out.println(linledList2);
       
        //methods
        linledList.addAll(arrayList1);// it will add the one list values into another list values conacatination is happen in bothe list
        linledList.add(2,8); //add the value at 2 postion
        linledList.remove(2);//remove the value at index position 2
        linledList.removeAll(linledList1);//it remove the same values in arrayList1
        linledList.retainAll(linledList1);//it will returnn the same value in bothe list
        linledList.contain(5)//it check the index postion if its there it true else false
        }
        }
