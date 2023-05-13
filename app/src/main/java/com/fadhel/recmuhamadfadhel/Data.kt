package com.fadhel.recmuhamadfadhel

class Data {
companion object{
    fun createDataFood():ArrayList<FoodData>{
        val list=ArrayList<FoodData>()
        list.add(
            FoodData(
                "Hoka Hemat 1",
                "Rp 27.500",
                "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/f0b9d580d9386a60506086a819fd1de4-1660019294911",
                "Composition : ",
                "HokBen special rice, salad, Ekkado and 3 Egg Chicken Roll *Salad for dine in only."

            ),
        )
        list.add(
            FoodData(
                "Paket c",
                "Rp 55.000",
                "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/0c633ccd48c9b5aa842b8948f589e4a7-1660011117755",
                "Composition : ",
                "Rice, Salad, Beef Triyaki, 2 pcs Shrimp Roll, 1 pc Tori Ball *Salad for dine in only."
            ),
        )
        list.add(
            FoodData(
                "SIMPLE SET CHICKEN TERIYAKI 1",
                "Rp 41.500",
                "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/5a9929ddeb4f83c610389c6643c276c3-1660033285821",
                "Composition : ",
                "Rice + Chicken Teriyaki + 2 pcs Egg Chicken Roll *Salad for dine in only."

            ),
        )
        list.add(
            FoodData(
                "BENTO SPECIAL 4",
                "Rp 63.000",
                "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/80d31dbc49226ec90929f330ef995469-1660019833554",
            "Composition : ",
                "Rice, Salad, Beef Teriyaki, Tori no Teba, Ebi Furai, Ebi Fried *Salad for dine in only."

            ),
        )
        list.add(
            FoodData(
                "HOKKAIDO MISO RAMEN REGULER",
                "Rp 35.000",
                "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/a6f407e5e2a291f7d7ece41eadb53758-1670863217303",
                "Composition : ",
                "Miso Ramen"

            ),
        )
        list.add(
            FoodData(
                "PAKET FRIED CHICKEN 1 PC",
                 "Rp 42.000",
                "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/1dee18e12f9178486d1c6f6e03acdce1-1660011255817",
                "Composition : ",
            "Fried Chicken with HokBen special spices"
            ),
        )
        return list
    }
}
}