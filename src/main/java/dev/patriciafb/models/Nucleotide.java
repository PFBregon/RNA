package dev.patriciafb.models;

public abstract class Nucleotide {
    private String sequence;

    public Nucleotide(String sequence) {
        if (!isValidSequence(sequence)) {
            throw new IllegalArgumentException("Invalid nucleotide sequence");
        }
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }

    protected boolean isValidSequence(String sequence) {
        return sequence.matches("[GCTA]+");
    }
}
