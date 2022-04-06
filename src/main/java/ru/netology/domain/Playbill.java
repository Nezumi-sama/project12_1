package ru.netology.domain;


public class Playbill {

    public String[] addFilm(String[] playbill, String film) {
        String[] playbillNew;
        int len = playbill.length;

        if (len == 1 && playbill[0] == null) {
            playbillNew = new String[1];
            playbillNew[0] = film;
        } else {
            playbillNew = new String[len + 1];
            for (int i = 0; i < playbill.length; i++) {
                playbillNew[i] = playbill[i];
            }
            playbillNew[playbillNew.length - 1] = film;
        }
        return playbillNew;
    }

    public String[] findAll(String[] playbill) {

        return playbill;
    }


    /*    public String[] findAll(String[] playbill) {
        int len = playbill.length;
        String[] playbillNew = new String[len];

        for (int i = 0; i < len; i++) {
            playbillNew[i] = playbill[len - 1 - i];
        }
        return playbillNew;
    }*/

    public String[] findLast(String[] playbill) {
        if (playbill.length <= 10) {
            return playbill;
        } else {
            String[] playbillLast = new String[10];
            int len = playbill.length - 10;

            for (int i = 0; i < 10; i++) {
                playbillLast[i] = playbill[len + i];
            }
            return playbillLast;
        }
    }

    public String[] findLast(String[] playbill, int last) {
        if (playbill.length <= last) {
            return playbill;
        } else {
            String[] playbillLast = new String[last];
            int len = playbill.length - last;

            for (int i = 0; i < last; i++) {
                playbillLast[i] = playbill[len + i];
            }
            return playbillLast;
        }
    }
}