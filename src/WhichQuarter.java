class WhichQuarter {
    String quarterNr;

    String whichQuarter(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            quarterNr = " w I ćwiartce układu współrzędnych.";
        } else if (point.getX() < 0 && point.getY() > 0) {
            quarterNr = " w II ćwiartce układu współrzędnych.";
        } else if (point.getX() < 0 && point.getY() < 0) {
            quarterNr = " w III ćwiartce układu współrzędnych.";
        } else if (point.getX() > 0 && point.getY() < 0) {
            quarterNr = " w IV ćwiartce układu współrzędnych.";
        } else {
            quarterNr = " na osi x lub y";
        }
        return quarterNr;
    }

    public String getInfo(Point point) {
        return "Punkt " + point.getX() + "," + point.getY() + " leży w " + quarterNr;
    }
}