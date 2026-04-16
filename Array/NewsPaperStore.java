class NewsPaperStore {

    NewsPaper[] newspapers = new NewsPaper[100];
    int index = 0;

    void save(NewsPaper newsPaper) {
        if (newsPaper != null) {
            if (index < newspapers.length) {
                this.newspapers[index] = newsPaper;
                System.out.println("newspaper saved at index " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println("NewsPaper is null");
        }
    }

    void saveAll(NewsPaper[] newsPapers) {
        System.out.println("\n===== SAVE ALL OPERATION =====\n");
        for (NewsPaper paper : newsPapers) {
            save(paper);
        }
        System.out.println("\n===== END SAVE ALL =====\n");
    }
	
	NewsPaper findByName(String name) {

    if (name != null) {

        for (int start = 0; start < this.newspapers.length; start++) {

            NewsPaper paper = this.newspapers[start];

            if (paper != null && paper.name == name) {

                System.out.println("NewsPaper found with name");
                paper.show();

                return paper;
            }
        }
    }

    System.out.println("NewsPaper not found with given name");
    return null;
}
    void displayAll() {
        System.out.println("\n========== DISPLAY ALL ==========\n");

        boolean found = false;

        for (NewsPaper paper : this.newspapers) {
            if (paper != null) {
                paper.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No NewsPapers available to display");
        }

        System.out.println("\n========== END DISPLAY ==========\n");
    }
	String findPaperQualityByName(String name) {

    if (name != null) {

        for (int start = 0; start < this.newspapers.length; start++) {

            NewsPaper paper = this.newspapers[start];

            if (paper != null && paper.name == name) {

                System.out.println("Paper found: " + name);
                System.out.println("Paper Quality: " + paper.paperQuality);

                return paper.paperQuality;
            }
        }
    }

    System.out.println("NewsPaper not found with given name");
    return null;
}
   int findNoOfPagesByNameAndHeadEditor(String name, String headEditor) {

    if (name != null && headEditor != null) {

        for (int start = 0; start < this.newspapers.length; start++) {

            NewsPaper paper = this.newspapers[start];

            if (paper != null && paper.name == name && paper.headEditor == headEditor) {

                System.out.println("NewsPaper found");
                System.out.println("Name: " + name);
                System.out.println("Head Editor: " + headEditor);
                System.out.println("No Of Pages: " + paper.noOfPages);

                return paper.noOfPages;
            }
        }
    }

    System.out.println("NewsPaper not found with given name and headEditor");
    return 0;
}

    void updateLangByName(String name, Lang newLang) {

    System.out.println("Running updateLangByName method for name : " + name);

    if (name != null && newLang != null) {

        for (NewsPaper paper : this.newspapers) {

            if (paper != null && paper.name == name) {

                paper.lang = newLang;

                System.out.println("Language updated for newspaper: " + name);
				System.out.println("new Language: " + newLang);
				
                paper.show();
            }
        }

    } else {
        System.out.println("name or newLang cannot be null");
    }
}
    void updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(
        InkColor inkColor, int noOfImages, int fontSize,
        String name, double height, double weight) {

    System.out.println("\n================ Update =================\n");

    boolean updated = false;

    if (inkColor != null && name != null && height > 0 && weight > 0) {

        for (int start = 0; start < this.newspapers.length; start++) {

            NewsPaper paper = this.newspapers[start];

            if (paper != null && paper.name == name && paper.height == height && paper.weight == weight) {

                

                System.out.println("\nOLD VALUES:");
                System.out.println("InkColor: " + paper.inkColor);
                System.out.println("No Of Images: " + paper.noOfImages);
                System.out.println("Font Size: " + paper.fontSize);

                paper.inkColor = inkColor;
                paper.noOfImages = noOfImages;
                paper.fontSize = fontSize;

                System.out.println("\nNEW VALUES:");
                System.out.println("InkColor: " + inkColor);
                System.out.println("No Of Images: " + noOfImages);
                System.out.println("Font Size: " + fontSize);

                paper.show();

                System.out.println("\n================ End =================\n");

                updated = true;
            }
        }

        if (!updated) {
            System.out.println("No matching NewsPaper found to update");
        }

    } else {
        System.out.println("Invalid input, cannot update");
    }
}
      void replaceByPrintHouseAddress(String printHouseAddress, NewsPaper newsPaper) {

    boolean replaced = false;

    System.out.println("\n===== Replace Operation =====\n");

    if (printHouseAddress != null && newsPaper != null) {

        for (int start = 0; start < this.newspapers.length; start++) {

            if (this.newspapers[start] != null &&
                this.newspapers[start].printHouseAddress == printHouseAddress) {

                

                System.out.println("OLD INSTANCE:");
                this.newspapers[start].show();

                this.newspapers[start] = newsPaper;

                System.out.println("NEW INSTANCE:");
                newsPaper.show();

                replaced = true;
            }
        }

        if (!replaced) {
            System.out.println("No matching print house address found");
        }

    } else {
        System.out.println("printHouseAddress or newsPaper cannot be null");
    }

    System.out.println("\n===== End replace =====\n");
}
}