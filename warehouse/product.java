public class product {


    private int id ;
    private String name ;
    private String category ;
    private int price ;
    private int stock_quantity;
    private boolean is_active;

  public product (int id , String name , String category ,int price , int stock_quantity,
        boolean is_active
    ){
        this.id = id ;
        this.name = name ;
        this.category =category;
        this.price = price ;
        this.stock_quantity= stock_quantity;
        this.is_active =is_active ;
    }



    public int getId(){return id ;}
    public String getName (){return name ;}
    public String getCategory(){return name ;}
    public int getPrice (){ return price ;}
    public int getStocK(){return stock_quantity ;}
    public boolean getStatus (){return is_active ;}

    @Override
    public String toString (){


      return   "The product is " + name  + " price is " + price ;



    }





}