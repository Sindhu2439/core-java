class Currencies {

    public static void main(String[] args){

        String[] currencies = {
            "Indian Rupee","US Dollar","Euro","British Pound","Japanese Yen",
            "Chinese Yuan","Canadian Dollar","Australian Dollar","Swiss Franc","Singapore Dollar",

            "UAE Dirham","Saudi Riyal","Kuwaiti Dinar","Qatari Riyal","Omani Rial",
            "Bahraini Dinar","Malaysian Ringgit","Thai Baht","Indonesian Rupiah","Philippine Peso",

            "South Korean Won","Sri Lankan Rupee","Nepalese Rupee","Pakistani Rupee","Bangladeshi Taka",
            "Afghan Afghani","Iranian Rial","Iraqi Dinar","Turkish Lira","Russian Ruble",

            "Ukrainian Hryvnia","Polish Zloty","Czech Koruna","Hungarian Forint","Swedish Krona",
            "Norwegian Krone","Danish Krone","Icelandic Krona","Brazilian Real","Argentine Peso",

            "Mexican Peso","Chilean Peso","Colombian Peso","Peruvian Sol","Venezuelan Bolivar",
            "South African Rand","Nigerian Naira","Kenyan Shilling","Egyptian Pound","Ghanaian Cedi",

            "Moroccan Dirham","Tunisian Dinar","Ethiopian Birr","Ugandan Shilling","Tanzanian Shilling",
            "Zimbabwe Dollar","Botswana Pula","Namibian Dollar","Zambian Kwacha","Mozambican Metical",

            "Cambodian Riel","Vietnamese Dong","Laotian Kip","Myanmar Kyat","Mongolian Tugrik",
            "Hong Kong Dollar","New Zealand Dollar","Fijian Dollar","Papua New Guinea Kina","Solomon Islands Dollar",

            "Samoan Tala","Tongan Paanga","Vanuatu Vatu","Maldivian Rufiyaa","Seychellois Rupee",
            "Mauritian Rupee","Malagasy Ariary","Rwandan Franc","Burundian Franc","Djiboutian Franc",

            "Comorian Franc","Central African CFA Franc","West African CFA Franc","Guinean Franc","Liberian Dollar",
            "Sierra Leone Leone","Sudanese Pound","South Sudanese Pound","Eritrean Nakfa","Somali Shilling",

            "Armenian Dram","Azerbaijani Manat","Georgian Lari","Kazakhstani Tenge","Uzbekistani Som",
            "Kyrgyzstani Som","Tajikistani Somoni","Turkmenistani Manat","Belarusian Ruble","Moldovan Leu",

            "Romanian Leu","Bulgarian Lev","Serbian Dinar","Croatian Kuna","Bosnia Mark",
            "Albanian Lek","North Macedonian Denar","Montenegrin Euro","Estonian Euro","Latvian Euro",

            "Lithuanian Euro","Cypriot Euro","Greek Euro","Italian Euro","Spanish Euro",
            "Portuguese Euro","French Euro","German Euro","Dutch Euro","Belgian Euro",

            "Luxembourg Euro","Irish Euro","Finnish Euro","Slovak Euro","Slovenian Euro"
        };

        for(int i = 0; i < currencies.length; i++){
            System.out.println( "currency name is " +currencies[i]+"is in the position" +i);
        }
    }
}