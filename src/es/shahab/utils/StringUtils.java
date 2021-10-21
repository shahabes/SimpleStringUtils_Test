package es.shahab.utils;

public class StringUtils {

    private String mainString;

    public StringUtils(String mainString){
        this.mainString = mainString;
    }

    public void setMainString(String mainString) {
        this.mainString = mainString;
    }


    public int find(String searchString){

        if(!this.areInputsValid(mainString, searchString))
            return -1;

        searchString = searchString.trim();
        mainString = mainString.trim();

        int searchStringSize = searchString.length();
        int mainStringSize = mainString.length();
        char firstSearchChar = searchString.charAt(0);

        for(int i = 0; i < mainStringSize; i++) {

            if(firstSearchChar == mainString.charAt(i)){

                boolean isFound = true;

                for(int j = 1; j < searchStringSize; j++){

                    if(searchString.charAt(j) != mainString.charAt(i + j)) {

                        isFound = false;

                        break;
                    }
                }

                if(isFound)
                    return i;

            }
        }

        return -1;
    }


    private boolean areInputsValid(String mainString, String searchString){
        boolean isSearchSizeValid = true;

        if((mainString == null || mainString.isEmpty())
                || (searchString == null || searchString.isEmpty())) {
            return false;
        }

        if(mainString.length() < searchString.length())
            isSearchSizeValid = false;

        return isSearchSizeValid;
    }

}
