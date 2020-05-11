pacote  com.example.agendiario ;



import  androidx.annotation.NonNull ;
import  androidx.annotation.Nullable ;
importar  androidx.room.ColumnInfo ;
importar  androidx.room.Entity ;
importar  androidx.room.PrimaryKey ;


@Entity ( tableName  =  " arts " )



 WorkOfArt de classe  pública {

 
    @PrimaryKey ( autoGenerate  =  true )
    @NonNull
    @ColumnInfo ( name  =  " artsId " )
    private  int mId;

    @Nullable
    @ColumnInfo ( name  =  " artsName " )
    private  String mName;

    private  String mLocation;

    públicas  WorkOfArt ( @Nullable  Cordas  título , Cordas  personage , int  score , Cordas  creationDate ) {
        mName = nome;
        mLocation = Localização ;
        mScore = pontuação;
        mCreationDate = creationDate;
    }

    public  int  getId () {
        return mID;
    }

    public  void  setId ( int  id ) {
        mId = id;
    }

    public  String  getName () {
        return mName;
    }

    public  void  setName ( Nome da string  ) {
        mName = nome;
    }

    public  String  getLocation () {
        retornar mLocation;
    }

    public  void  setLocation ( Localização da string  ) {
        mPersonage = Localização;
    }

    public  int  getScore () {
        retornar mScore;
    }

    público  vazio  setScore ( int  score ) {
        mScore = pontuação;
    }

    public  String  getCreationDate () {
        return mCreationDate;
    }

    public  void  setCreationDate ( String  creationDate ) {
        mCreationDate = creationDate;
    }

    private  int mScore;
    private  String mCreationDate;

}
