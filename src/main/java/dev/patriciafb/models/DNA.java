package dev.patriciafb.models;

public class DNA extends Nucleotide {

    public DNA(String sequence) {
        super(sequence);
        if (!isValidDNA(sequence)) {
            throw new IllegalArgumentException("Invalid DNA sequence");
        }
    }

    public boolean isValidDNA(String sequence) {
        return sequence.matches("[GCTA]+");
    }
}
