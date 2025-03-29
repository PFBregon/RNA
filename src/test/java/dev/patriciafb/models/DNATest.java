package dev.patriciafb.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DNATest {
    @Test
    void testValidDNASequence() {
        DNA dna = new DNA("GCTA");
        assertEquals("GCTA", dna.getSequence());
    }

    @Test
    void testEmptyDNASequence() {
        DNA dna = new DNA("");
        assertEquals("", dna.getSequence());
    }
}
