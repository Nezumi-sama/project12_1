import ru.netology.domain.Playbill;

public class Main {
    public static void main(String[] args) {
        Playbill service = new Playbill();
        String[] filmList = new String[1];

        filmList = service.addFilm(filmList, "Властелин колец");
        filmList = service.addFilm(filmList, "Шрек");

        service.findLast(filmList, 2);

        filmList = service.addFilm(filmList, "Интерстеллар");
        filmList = service.addFilm(filmList, "Маска");
        filmList = service.addFilm(filmList, "Матрица");

        service.findLast(filmList);
        service.findLast(filmList, 3);

        filmList = service.addFilm(filmList, "Зеленая миля");
        filmList = service.addFilm(filmList, "Ходячий замок Хоула");
        filmList = service.addFilm(filmList, "Унесенные призраками");
        filmList = service.addFilm(filmList, "Унесенные ветром");
        filmList = service.addFilm(filmList, "Тихий дон");
        filmList = service.addFilm(filmList, "Девчата");
        filmList = service.addFilm(filmList, "Обливион");
        filmList = service.addFilm(filmList, "Оно");
        filmList = service.addFilm(filmList, "Другие");

        service.findAll(filmList);

        service.findLast(filmList);
        service.findLast(filmList, 5);

    }
}
