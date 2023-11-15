public interface Observer {
    public void updateNewRep(Matiere mat); // notifie les etudiants lors de la création d'un nouveau répertoire
    public void updateNewDoc(Matiere mat); // notifie les etudiants lorsque un nouveau doc est déposé dans une matière
}
