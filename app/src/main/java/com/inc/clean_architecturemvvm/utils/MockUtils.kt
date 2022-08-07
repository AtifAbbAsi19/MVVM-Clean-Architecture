package com.inc.clean_architecturemvvm.utils

object MockUtils {

    const val articleSuccessResponse = "{\n" +
            "  \"status\": \"OK\",\n" +
            "  \"copyright\": \"Copyright (c) 2022 The New York Times Company.  All Rights Reserved.\",\n" +
            "  \"num_results\": 20,\n" +
            "  \"results\": [\n" +
            "    {\n" +
            "      \"uri\": \"nyt://article/c2e1206a-a95e-57d2-97e1-68ceb20b25c9\",\n" +
            "      \"url\": \"https://www.nytimes.com/2022/07/29/us/megamillions-jackpot.html\",\n" +
            "      \"id\": 100000008466058,\n" +
            "      \"asset_id\": 100000008466058,\n" +
            "      \"source\": \"New York Times\",\n" +
            "      \"published_date\": \"2022-07-29\",\n" +
            "      \"updated\": \"2022-07-30 16:44:33\",\n" +
            "      \"section\": \"U.S.\",\n" +
            "      \"subsection\": \"\",\n" +
            "      \"nytdsection\": \"u.s.\",\n" +
            "      \"adx_keywords\": \"Lotteries;Frauds and Swindling;Kurland, Jason M\",\n" +
            "      \"column\": null,\n" +
            "      \"byline\": \"By Christine Hauser\",\n" +
            "      \"type\": \"Article\",\n" +
            "      \"title\": \"Single Mega Millions Ticket Wins \$1.34 Billion as Jackpot Grows\",\n" +
            "      \"abstract\": \"The total rose again Saturday, but it was not yet known who bought the \$2 ticket in Illinois that matched all five winning numbers and the Mega Ball — 67, 45, 57, 36, 13 and 14.\",\n" +
            "      \"des_facet\": [\n" +
            "        \"Lotteries\",\n" +
            "        \"Frauds and Swindling\"\n" +
            "      ],\n" +
            "      \"org_facet\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"per_facet\": [\n" +
            "        \"Kurland, Jason M\"\n" +
            "      ],\n" +
            "      \"geo_facet\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"media\": [\n" +
            "        {\n" +
            "          \"type\": \"image\",\n" +
            "          \"subtype\": \"photo\",\n" +
            "          \"caption\": \"A Mega Millions lottery ticket at a 7-Eleven convenience store in Chino Hills, Calif., on Thursday.\",\n" +
            "          \"copyright\": \"Ringo Chiu/Agence France-Presse — Getty Images\",\n" +
            "          \"approved_for_syndication\": 1,\n" +
            "          \"media-metadata\": [\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2022/07/29/multimedia/29xp-megamillions-02/29xp-megamillions-02-thumbStandard.jpg\",\n" +
            "              \"format\": \"Standard Thumbnail\",\n" +
            "              \"height\": 75,\n" +
            "              \"width\": 75\n" +
            "            },\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2022/07/29/multimedia/29xp-megamillions-02/29xp-megamillions-02-mediumThreeByTwo210.jpg\",\n" +
            "              \"format\": \"mediumThreeByTwo210\",\n" +
            "              \"height\": 140,\n" +
            "              \"width\": 210\n" +
            "            },\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2022/07/29/multimedia/29xp-megamillions-02/29xp-megamillions-02-mediumThreeByTwo440.jpg\",\n" +
            "              \"format\": \"mediumThreeByTwo440\",\n" +
            "              \"height\": 293,\n" +
            "              \"width\": 440\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"eta_id\": 0\n" +
            "    }\n" +
            "  ]\n" +
            "}"


    const val articleFailResponse = "{\n" +
            "  \"status\": \"Fail\",\n" +
            "  \"copyright\": \"Copyright (c) 2022 The New York Times Company.  All Rights Reserved.\",\n" +
            "  \"num_results\": 20,\n" +
            "  \"results\": [\n" +
            "    \n" +
            "  ]\n" +
            "}"

}