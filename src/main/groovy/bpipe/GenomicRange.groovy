package bpipe

import groovy.lang.IntRange

import java.io.Serializable;

/**
 * Extends the normal Integer Range class to make it serializable
 */
class GenomicRange implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    int from
    
    int to
   
    /**
     * Convert a non-Genomic range into a GenomicRange
     */
    GenomicRange(Range r) {
        this.from = r.from
        this.to = r.to
    }
    
    /**
     * Convenience method to make constructing ranges very concise
     */
    public static GenomicRange range(Range r) {
        new GenomicRange(r)
    } 
    
    int size() {
        return Math.abs(from - to)
    }
}
