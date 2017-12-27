public class ExampleArrayList{
   public static void main(String[] args){
        
        List arrayList = new ArrayList<>(); //without object type declaration 
        
        arrayList.add(3);       //In Collections we can add any type of data ,we can add and delete any time
        arrayList.add(3.4);
        arrayList.add(true);
        arrayList.add("string");
        arrayList.add(3);
        
        System.out.println(arrayList); //[3,3.4,true,string,3] //data will store in indexex
        
        //another type of creating arraylist class
        
        List <object> arrayList1 = new ArrayList<object>(); //Object is a super class of classes, here object is type of data
                                                      //same as above method but if we declare a class without type declaration its give a warring
        arrayList1.add(3);
        arrayList1.add(3.4);
        arrayList1.add(true);
        arrayList1.add("string");
        arrayList1.add(3);
        
        System.out.println(arrayList);
        
        //one  more type of creation
        
        List <Integer> arrayList2 = new ArrayList<Integer>(); //here Integer is class not an primitive. In collection we work with objects and classes not with primitivites
                                                              // if we declare a list as Integer its only allow to stroe integer values it cannot store other type of values if we store its give an compile time error
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(true);//compiletime eeror becuse its a boolean value
        arrayList1.add(5);
        arrayList1.add(6);
        System.out.println(arrayList);
       
        //methods
        arrayList.addAll(arrayList1);// it will add the one list values into another list values conacatination is happen in bothe list
        arrayList.add(2,8); //add the value at 2 postion
        arrayList.remove(2);//remove the value at index position 2
        arrayList.removeAll(arrayList1);//it remove the same values in arrayList1
        arrayList.retainAll(arrayList1);//it will returnn the same value in bothe list
        arrayList.contain(5)//it check the index postion if its there it true else false
        }
        }
