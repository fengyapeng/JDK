/*
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package jdk.vm.ci.hotspot.sparc;

import jdk.vm.ci.hotspot.HotSpotVMConfigAccess;
import jdk.vm.ci.hotspot.HotSpotVMConfigStore;

/**
 * Used to access native configuration details.
 *
 * All non-static, public fields in this class are so that they can be compiled as constants.
 */
class SPARCHotSpotVMConfig extends HotSpotVMConfigAccess {

    SPARCHotSpotVMConfig(HotSpotVMConfigStore config) {
        super(config);
    }

    final boolean useCompressedOops = getFlag("UseCompressedOops", Boolean.class);

    // @formatter:off
    // CPU capabilities:
    //
    // FIXME: Using a 64-bit value is insufficient to support future capability
    //        sets (including co-processor capabilities such as DAX).
    final long vmVersionFeatures = getFieldValue("Abstract_VM_Version::_features", Long.class, "uint64_t");

    //
    // SPARC specific values:
    //
    // NOTE: Values changed into an enumeration (that do indeed fit within a
    //       32-bit integer) instead of the exported (64-bit wide) bit-masks.
    final int sparc_ADI      = getConstant("VM_Version::ISA_ADI",      Integer.class);
    final int sparc_AES      = getConstant("VM_Version::ISA_AES",      Integer.class);
    final int sparc_BLK_INIT = getConstant("VM_Version::ISA_BLK_INIT", Integer.class);
    final int sparc_CAMELLIA = getConstant("VM_Version::ISA_CAMELLIA", Integer.class);
    final int sparc_CBCOND   = getConstant("VM_Version::ISA_CBCOND",   Integer.class);
    final int sparc_CRC32C   = getConstant("VM_Version::ISA_CRC32C",   Integer.class);
    final int sparc_DES      = getConstant("VM_Version::ISA_DES",      Integer.class);
    final int sparc_DICTUNP  = getConstant("VM_Version::ISA_DICTUNP",  Integer.class);
    final int sparc_FMAF     = getConstant("VM_Version::ISA_FMAF",     Integer.class);
    final int sparc_FPCMPSHL = getConstant("VM_Version::ISA_FPCMPSHL", Integer.class);
    final int sparc_HPC      = getConstant("VM_Version::ISA_HPC",      Integer.class);
    final int sparc_IMA      = getConstant("VM_Version::ISA_IMA",      Integer.class);
    final int sparc_KASUMI   = getConstant("VM_Version::ISA_KASUMI",   Integer.class);
    final int sparc_MD5      = getConstant("VM_Version::ISA_MD5",      Integer.class);
    final int sparc_MME      = getConstant("VM_Version::ISA_MME",      Integer.class);
    final int sparc_MONT     = getConstant("VM_Version::ISA_MONT",     Integer.class);
    final int sparc_MPMUL    = getConstant("VM_Version::ISA_MPMUL",    Integer.class);
    final int sparc_MWAIT    = getConstant("VM_Version::ISA_MWAIT",    Integer.class);
    final int sparc_PAUSE    = getConstant("VM_Version::ISA_PAUSE",    Integer.class);
    final int sparc_PAUSE_NSEC = getConstant("VM_Version::ISA_PAUSE_NSEC", Integer.class);
    final int sparc_POPC     = getConstant("VM_Version::ISA_POPC",     Integer.class);
    final int sparc_RLE      = getConstant("VM_Version::ISA_RLE",      Integer.class);
    final int sparc_SHA1     = getConstant("VM_Version::ISA_SHA1",     Integer.class);
    final int sparc_SHA256   = getConstant("VM_Version::ISA_SHA256",   Integer.class);
    final int sparc_SHA3     = getConstant("VM_Version::ISA_SHA3",     Integer.class);
    final int sparc_SHA512   = getConstant("VM_Version::ISA_SHA512",   Integer.class);
    final int sparc_SPARC5   = getConstant("VM_Version::ISA_SPARC5",   Integer.class);
    final int sparc_SPARC5B  = getConstant("VM_Version::ISA_SPARC5B",  Integer.class);
    final int sparc_SPARC6   = getConstant("VM_Version::ISA_SPARC6",   Integer.class);
    final int sparc_V9       = getConstant("VM_Version::ISA_V9",       Integer.class);
    final int sparc_VAMASK   = getConstant("VM_Version::ISA_VAMASK",   Integer.class);
    final int sparc_VIS1     = getConstant("VM_Version::ISA_VIS1",     Integer.class);
    final int sparc_VIS2     = getConstant("VM_Version::ISA_VIS2",     Integer.class);
    final int sparc_VIS3     = getConstant("VM_Version::ISA_VIS3",     Integer.class);
    final int sparc_VIS3B    = getConstant("VM_Version::ISA_VIS3B",    Integer.class);
    final int sparc_VIS3C    = getConstant("VM_Version::ISA_VIS3C",    Integer.class);
    final int sparc_XMONT    = getConstant("VM_Version::ISA_XMONT",    Integer.class);
    final int sparc_XMPMUL   = getConstant("VM_Version::ISA_XMPMUL",   Integer.class);

    final int sparc_BLK_ZEROING = getConstant("VM_Version::CPU_BLK_ZEROING", Integer.class);
    final int sparc_FAST_BIS    = getConstant("VM_Version::CPU_FAST_BIS",    Integer.class);
    final int sparc_FAST_CMOVE  = getConstant("VM_Version::CPU_FAST_CMOVE",  Integer.class);
    final int sparc_FAST_IDIV   = getConstant("VM_Version::CPU_FAST_IDIV",   Integer.class);
    final int sparc_FAST_IND_BR = getConstant("VM_Version::CPU_FAST_IND_BR", Integer.class);
    final int sparc_FAST_LD     = getConstant("VM_Version::CPU_FAST_LD",     Integer.class);
    final int sparc_FAST_RDPC   = getConstant("VM_Version::CPU_FAST_RDPC",   Integer.class);

    final boolean useBlockZeroing = getFlag("UseBlockZeroing", Boolean.class);
    final int blockZeroingLowLimit = getFlag("BlockZeroingLowLimit", Integer.class);
    // @formatter:on
}
