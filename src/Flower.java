public class Flower {
    private String flowerName;
    private String country;
    private String cost;
    private String lifeSpan;

    public Flower(String flowerName, String country, String cost, String lifeSpan) {

        if (flowerName == null || flowerName == "") {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country == "") {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost == "-" || cost == null) {
            this.cost = "1 рубль";
        } else {
            this.cost = cost;
        }
        if (lifeSpan == null || lifeSpan == "") {
            this.lifeSpan = "3";
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName( String flowerName) {
        this.flowerName = flowerName;
    }
public String getCountry() {
        return country;
}

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString () {
        return
                "Название цветка: " + flowerName + ". Страна-производитель: " + country +
                        " Стоимость за штуку: " + cost + " руб." +
                        " Срок хранения: " + lifeSpan + " дня(ей).";
    }
}
