package product;

public class Product {

    private static final double porez = 20;
    //protected - naslijednici klase product.Product vide ove polja
    protected String nazivProizvoda;
    protected String barcode;
    protected double cijena;

    public Product(String nazivProizvoda, String barcode, double cijena) {
        this.nazivProizvoda = nazivProizvoda;
        this.barcode = barcode;
        this.cijena = cijena;
    }

    public double konacnaCijenaProizvodaSaPdv() {
        //100+(100*20)/100
        //100+100*0.2
        return cijena + (cijena * 20) / 100;
    }


    public String getInfo() {
        //Linux \n  Windows \r\n
        return "Naziv Proizvoda: " + nazivProizvoda + ",  " +
                "Barcode: " + barcode + ", " +
                "Cijena: " + cijena;
    }


    /**
     * Vraća text koji opisuje objekat
     *
     * @return String
     */
    @Override
    public String toString() {
        return "product.Product[" +
                "Naziv proizvoda='" + nazivProizvoda + '\'' +
                ", barkod='" + barcode + '\'' +
                ", cijena=" + cijena +
                ']';
    }
}
