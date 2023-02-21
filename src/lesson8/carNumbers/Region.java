package lesson8.carNumbers;

public enum Region {
           ADYGEYA ("Республика Адыгея", new String[]{"01"}),
           BASHKARTOSTAN ("Республика Башкортостан",new String[]{"02", "102", "702"}),
           BURYATIYA ("Республика Бурятия",new String[]{"03"}),
           ALTAY ("Республика Алтай",new String[]{ 	"04"}),
           DAGESTAN ("Республика Дагестан",new String[]{ 	"05"}),
           INGUSHETIYA ("Республика Ингушетия",new String[]{ 	"06"}),
           KABARDINO_BALKARSKAYA_RESP ("Кабардино-Балкарская Республика",new String[]{ 	"07"}),
           KALMYKIYA ("Республика Калмыкия",new String[]{ 	"08"}),
           KARACHAEVO_CHERKESIYA ("Республика Карачаево-Черкесия",new String[]{ 	"09"}),
           KARELIYA ("Республика Карелия",new String[]{ 	"10"}),
           KOMI ("Республика Коми",new String[]{ 	"11"}),
           MARIY_L ("Республика Марий Эл",new String[]{ 	"12"}),
           MORDOVIYA ("Республика Мордовия",new String[]{ 	"13", "113"}),
           SAHA ("Республика Саха (Якутия)",new String[]{ 	"14"}),
           NORTH_ASETI ("Республика Северная Осетия — Алания",new String[]{ 	"15"}),
           TATARSTAN ("Республика Татарстан",new String[]{ 	"16", "116", "716"}),
           TYVA ("Республика Тыва",new String[]{ 	"17"}),
           UDMURTIIAN ("Удмуртская Республика",new String[]{ 	"18"}),
           KHAKASSIA ("Республика Хакасия",new String[]{ 	"19"}),
           CHUVASH ("Чувашская Республика",new String[]{ 	"21", "121"}),
           ALTAI_TERRITORY ("Алтайский край",new String[]{ 	"22", "122"}),
           KRASNODAR_TERRITORY ("Краснодарский край",new String[]{ 	"23", "93", "123", "193"}),
           KRASNOYARSK_TERRITORY ("Красноярский край",new String[]{ 	"24", "84", "88", "124"}),
           PERM_TERRITORY ("Приморский край",new String[]{ 	"25", "125"}),
           STAVROPOL_TERRITORY ("Ставропольский край",new String[]{ 	"26", "126"}),
           KHABAROVSK_TERRITORY ("Хабаровский край",new String[]{ 	"27", "127"}),
           AMUR_REGION ("Амурская область",new String[]{ 	"28"}),
           ARKHANGELSK_REGION ("Архангельская область",new String[]{ 	"29"}),
           ASTRAKHAN_REGION ("Астраханская область",new String[]{ 	"30"}),
           BELGOROD_REGION ("Белгородская область",new String[]{ 	"31"}),
           BRYANSK_REGION ("Брянская область",new String[]{ 	"32"}),
           VLADIMIR_REGION ("Владимирская область",new String[]{ 	"33"}),
           VOLGOGRAD_REGION ("Волгоградская область",new String[]{ 	"34", "134"}),
           VORONEZH_REGION ("Воронежская область",new String[]{ 	"36", "136"}),
           IVANOVO ("Ивановская область",new String[]{ 	"37"}),
           IRKUTSK_REGION ("Иркутская область",new String[]{ 	"38", "138"}),
           KALININGRAD_REGION ("Калининградская область",new String[]{ 	"39", "91"}),
            KALUGA("Калужская область",new String[]{ 	"40"}),
            KAVCHATKA("Камчатский край",new String[]{ 	"41"}),
            KEMEROVO("Кемеровская область",new String[]{ 	"42", "142"}),
            KIROV("Кировская область",new String[]{ 	"43"}),
            KOSTROMA("Костромская область",new String[]{ 	"44"}),
            KURGAN("Курганская область",new String[]{ 	"45"}),
            KURSK("Курская область",new String[]{ 	"46"}),
            LENINGRAD_REGION("Ленинградская область",new String[]{ 	"47", "147"}),
            LIPETSK("Липецкая область",new String[]{ 	"48"}),
            MAGADAN("Магаданская область",new String[]{ 	"49"}),
            MOSCOW_REGION("Московская область",new String[]{ 	"50", "90", "150", "190", "750", "790"}),
            MURMANSK("Мурманская область",new String[]{ 	"51"}),
            NIZHNY_NOVGOROD("Нижегородская область",new String[]{ 	"52", "152"}),
            NOVGOROD_REGION("Новгородская область",new String[]{ 	"53"}),
            NOVOSIBIRSK_REGION("Новосибирская область",new String[]{ 	"54", "154"}),
            OMSK("Омская область",new String[]{ 	"55", "155"}),
            ORNBURG_REGION("Оренбургская область",new String[]{ 	"56", "156"}),
            OREL("Орловская область",new String[]{ 	"57"}),
            PENZA_REGION("Пензенская область",new String[]{ 	"58"}),
            PERM("Пермский край",new String[]{ 	"59", "81", "159"}),
            PSKOV_REGION("Псковская область",new String[]{ 	"60"}),
            ROSTOV("Ростовская область",new String[]{ 	"61", "161", "761"}),
            RYAZAN_REGION("Рязанская область",new String[]{ 	"62"}),
            SAMARA("Самарская область",new String[]{ 	"63", "163", "763"}),
            SARATOV("Саратовская область",new String[]{ 	"64", "164"}),
            SAKHALIN("Сахалинская область",new String[]{ 	"65"}),
            SVERDLOVSK("Свердловская область",new String[]{ 	"66", "96", "196"}),
            SMOLENSK("Смоленская область",new String[]{ 	"67"}),
            TAMBOV_REGION("Тамбовская область",new String[]{ 	"68"}),
            TVER_REGION("Тверская область",new String[]{ 	"69", "169"}),
            TOMSK("Томская область",new String[]{ 	"70"}),
            TULA("Тульская область",new String[]{ 	"71"}),
            TYUMEN_REGION("Тюменская область",new String[]{ 	"72"}),
            ULYANOVSK_REGION("Ульяновская область",new String[]{ 	"73", "173"}),
            CHELYABINSK("Челябинская область",new String[]{ 	"74", "174", "774"}),
            CHITA("Забайкальский край",new String[]{ 	"75"}),
            YAROSLAVL("Ярославская область",new String[]{ 	"76"}),
            MOSCOW("Москва",new String[]{ 	"77", "97", "99", "177", "199", "197", "777", "797", "799", "977"}),
            ST_PETERSBURG("Санкт-Петербург",new String[]{ 	"78", "98", "178", "198"}),
            JEWISH_REGION("Еврейская автономная область",new String[]{ 	"79"}),
            NENETS("Ненецкий автономный округ",new String[]{ 	"83"}),
            KHANTY_MANSI("Ханты-Мансийский автономный округ Югра",new String[]{ 	"86", "186"}),
            CHUKOTKA("Чукотский автономный округ",new String[]{ 	"87"}),
            YAMAL_NENETS("Ямало-Ненецкий автономный округ",new String[]{ 	"89"}),
            BAYKONUR("Байконур",new String[]{ 	"94"}),
            CHECHNYA("Чеченская республика",new String[]{ 	"95"});
            private String regionTitle;
            private String[]  regionNumbers;

    Region(String regionTitle, String[] regionNumbers) {
        this.regionTitle = regionTitle;
        this.regionNumbers = regionNumbers;
   }

    public String getRegionTitle() {
        return regionTitle;
    }

    public String[] getRegionNumbers() {
        return regionNumbers;
    }
}
