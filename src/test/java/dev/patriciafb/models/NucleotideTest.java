package dev.patriciafb.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NucleotideTest {

    private static class TestNucleotide extends Nucleotide {
        public TestNucleotide(String sequence) {
            super(sequence);
        }
    }

    @Test
    void testValidSequence() {
        TestNucleotide sequence = new TestNucleotide("GCTA");
        assertEquals("GCTA", sequence.getSequence());
    }
}
