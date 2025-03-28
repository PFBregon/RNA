package dev.patriciafb.models;

public class DNA {

    private String sequence;

    public DNA(String sequence) {
        if (isValidDNA(sequence)) {
            this.sequence = sequence;
        } else {
            throw new IllegalArgumentException("Invalid DNA sequence");
        }
    }

    private boolean isValidDNA(String sequence2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidDNA'");
    }

    public String getSequence() {
        return sequence;
    }
}


