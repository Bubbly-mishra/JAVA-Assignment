import java.util.*;

class Grocery 
{
    public static int indexFind(ArrayList<String> list ,String src)
    {

      
        
        for(int i = 0 ; i<list.size();i++)
        {
            if(list.get(i).equals(src))
            {
                return i ;
            }

        }
        return -1 ;
    }
    public static void main(String[] args)
    {
        ArrayList<String> name = new ArrayList<String>() ;
        ArrayList<Double> qnt = new ArrayList<Double>() ;
        ArrayList<Double> pric = new ArrayList<Double>() ;
        Scanner ob = new Scanner(System.in) ;
        System.out.println("Enter your budget :");
        double budget = ob.nextDouble() ;

        boolean b = true ;
        while(b)
        {
            System.out.println("Enter 1 to Add an Item.");
            System.out.println("Enter 2 to Exit.");
            System.out.println("\n\n");
            System.out.println("Enter your choice : ");
            int choice = ob.nextInt() ;
            switch(choice)
            {
                case 1 : 
                System.out.print("Enter Product : ");
                String product = ob.next() ;
                System.out.print("\nEnter quantity : ");
                double quantity = ob.nextDouble() ;
                System.out.print("\nEnter price : ");
                double price = ob.nextDouble() ;
    
                if(price>budget)
                {
                    System.out.println("\nCan't Buy the product ####(because budget left is "+budget+" )\n");
                }
                else 
                {
                    int index = indexFind(name,product) ;
                   if(index == -1)
                   {
                       name.add(product) ;
                       qnt.add(quantity) ;
                       pric.add(price) ;
                   }
                   else
                   {
                     budget+=pric.get(index) ;
                     qnt.set(index,quantity) ;
                     pric.set(index,price) ;  
                   }
                   budget-=price ;
                   System.out.println("\nAmount left : "+budget+"\n");
                }

                break ;

                case 2 :
                      b = false ;
                      break ;

            }
           
           

        }
        
        if(budget!=0.0)
        {
            String pname = "" ;
            double min = 0 ;
            for(int i=0;i<pric.size();i++)
            {
                if(pric.get(i)<=budget && pric.get(i)>min)
                {
                    min = pric.get(i) ;
                    pname = name.get(i) ;
                }
            }
            if(!pname.equals(""))
            System.out.println("Amount left can buy you "+pname) ;
        }

        System.out.println("Grocery List is :");
        System.out.println("Product name \t Quantity \t Price");
        for(int i=0;i<pric.size();i++)
        {
            System.out.println(name.get(i)+"\t"+qnt.get(i)+"\t"+pric.get(i));
        }
    }
    
}