package com.example.monopizzamenu.list

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize data class ArticleModel(
    val image: String,
    val title: String,
    val ingredients: String,
    val price: String
) : Parcelable {
    companion object {
        fun createDefultData(): List<ArticleModel> {
            val list = ArrayList<ArticleModel>()
            list.add(ArticleModel("https://x100-venus-mp-ua.gumlet.io/SKU/SUSHI-MASTER/Піца/8A8A53E1-462C-11ED-8926-418E5ACF9DBD-1969х1100_0031_5%20сирів.jpg?alt=media&token=11d817c5-ad74-4286-846d-ad200d93ce07&w=1280&h=700&format=png&mode=fit&q=59","Піца 5 сирів","Сир моцарела, сир Пармезан, сир Дор Блю, сир чедер слайс, сир фета, вершковий соус","149₴"))
            list.add(ArticleModel("https://x100-venus-mp-ua.gumlet.io/SKU/SUSHI-MASTER/Піца/291D63E1-4857-11ED-ADC4-85958ECA5C47-1969х1100_0026_Дьябола.jpg?alt=media&token=2bc627f2-585e-40a7-98bf-780d89769876&w=1280&h=700&format=png&mode=fit&q=59","Піца Дьябола","Пепероні, сир моцарела, сир Дор Блю, сир пармезан, перець ","229₴"))
            list.add(ArticleModel("https://x100-venus-mp-ua.gumlet.io/SKU/SUSHI-MASTER/Піца/9E646FB1-4625-11ED-AD1C-036E3025CB4C-1969х1100_0016_Пепероні.jpg?alt=media&token=50aa01e9-2ef4-4ad9-b255-f8ee48286f9c&w=1280&h=700&format=png&mode=fit&q=59","Піца Пепероні","Пепероні, сир моцарела, італійські трави, томатний соус","199₴"))
            list.add(ArticleModel("https://x100-venus-mp-ua.gumlet.io/SKU/SUSHI-MASTER/Піца/06FD3731-4641-11ED-ADC4-85958ECA5C47-1969х1100_0018_Мясна.jpg?alt=media&token=f33478f2-076e-4f7a-b571-28268d326fce&w=1280&h=700&format=png&mode=fit&q=59","Піца Мʼясна","Пепероні, шинка, мислиські ковбаски, куряча грудка, бекон, сир моцарела, томати, прованські трави, гірчиця, томатний соус","219₴"))
            list.add(ArticleModel("https://x100-venus-mp-ua.gumlet.io/SKU/SUSHI-MASTER/Піца/FAD62471-4641-11ED-8926-418E5ACF9DBD-1969х1100_0015_З%20куркою%20та%20грибами.jpg?alt=media&token=0663d044-e00f-47ac-ae21-dcc46c2c04bf&w=1280&h=700&format=png&mode=fit&q=59","Піца з куркою та грибами","Куряча грудка, сир моцарела, печериці, червона цибуля, салат айсберг, рукола, паприка, соус бешамель","249₴"))
            return list
        }

    }



}
