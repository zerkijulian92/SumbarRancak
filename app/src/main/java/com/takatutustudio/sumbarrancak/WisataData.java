package com.takatutustudio.sumbarrancak;

import java.util.ArrayList;

public class WisataData {
    public static String[][] data = new String[][]{
            {
                "Puncak Chinangkiak",
                    "Jalan singkarak solok",
                    "http://visitsolok.com/files/2017-11/11111111111.jpg",
                    "Deskripsi lorem ipsum"
            },

            {
                "Danau Maninjau",
                    "Jalan Maninjau",
                    "https://m2indonesia.com/wp-content/uploads/sites/2/2015/07/maninjau-lake.jpg",
                    "Deskripsi lorem ipsum"
            },

            {
                "Danau Singkarak",
                    "Jalan singkarak",
                    "https://media.beritagar.id/2015-10/0d8e6c4b783aec3702ecd494f7149011.jpg",
                    "Deskripsi lorem ipsum"
            }

    };
    public static ArrayList<WisataSumbar> getListData(){
        WisataSumbar wisatasumbar = null;
        ArrayList<WisataSumbar> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            wisatasumbar = new WisataSumbar();
            wisatasumbar.setName(data[i][0]);
            wisatasumbar.setRemarks(data[i][1]);
            wisatasumbar.setPhoto(data[i][2]);
            wisatasumbar.setDeskripsi(data[i][3]);

            list.add(wisatasumbar);
        }

        return list;
    }
}
