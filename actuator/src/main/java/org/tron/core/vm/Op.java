package org.tron.core.vm;

public class Op {
  public static final int STOP = 0x00;
  public static final int ADD = 0x01;
  public static final int MUL = 0x02;
  public static final int SUB = 0x03;
  public static final int DIV = 0x04;
  public static final int SDIV = 0x05;
  public static final int MOD = 0x06;
  public static final int SMOD = 0x07;
  public static final int ADDMOD = 0x08;
  public static final int MULMOD = 0x09;
  public static final int EXP = 0x0a;
  public static final int SIGNEXTEND = 0x0b;
  public static final int LT = 0X10;
  public static final int GT = 0X11;
  public static final int SLT = 0X12;
  public static final int SGT = 0X13;
  public static final int EQ = 0X14;
  public static final int ISZERO = 0x15;
  public static final int AND = 0x16;
  public static final int OR = 0x17;
  public static final int XOR = 0x18;
  public static final int NOT = 0x19;
  public static final int BYTE = 0x1a;
  public static final int SHL = 0x1b;
  public static final int SHR = 0x1c;
  public static final int SAR = 0x1d;
  public static final int SHA3 = 0x20;
  public static final int ADDRESS = 0x30;
  public static final int BALANCE = 0x31;
  public static final int ORIGIN = 0x32;
  public static final int CALLER = 0x33;
  public static final int CALLVALUE = 0x34;
  public static final int CALLDATALOAD = 0x35;
  public static final int CALLDATASIZE = 0x36;
  public static final int CALLDATACOPY = 0x37;
  public static final int CODESIZE = 0x38;
  public static final int CODECOPY = 0x39;
  public static final int RETURNDATASIZE = 0x3d;
  public static final int RETURNDATACOPY = 0x3e;
  public static final int GASPRICE = 0x3a;
  public static final int EXTCODESIZE = 0x3b;
  public static final int EXTCODECOPY = 0x3c;
  public static final int EXTCODEHASH = 0x3f;
  public static final int BLOCKHASH = 0x40;
  public static final int COINBASE = 0x41;
  public static final int TIMESTAMP = 0x42;
  public static final int NUMBER = 0x43;
  public static final int DIFFICULTY = 0x44;
  public static final int GASLIMIT = 0x45;
  public static final int CHAINID = 0x46;
  public static final int SELFBALANCE = 0x47;
  public static final int BASEFEE = 0x48;
  public static final int POP = 0x50;
  public static final int MLOAD = 0x51;
  public static final int MSTORE = 0x52;
  public static final int MSTORE8 = 0x53;
  public static final int SLOAD = 0x54;
  public static final int SSTORE = 0x55;
  public static final int JUMP = 0x56;
  public static final int JUMPI = 0x57;
  public static final int PC = 0x58;
  public static final int MSIZE = 0x59;
  public static final int GAS = 0x5a;
  public static final int JUMPDEST = 0x5b;
  public static final int PUSH = 0x60;
  public static final int DUP = 0x80;
  public static final int SWAP = 0x90;
  public static final int LOG = 0xa0;
  public static final int CALLTOKEN = 0xd0;
  public static final int TOKENBALANCE = 0xd1;
  public static final int CALLTOKENVALUE = 0xd2;
  public static final int CALLTOKENID = 0xd3;
  public static final int ISCONTRACT = 0xd4;
  public static final int FREEZE = 0xd5;
  public static final int UNFREEZE = 0xd6;
  public static final int FREEZEEXPIRETIME = 0xd7;
  public static final int VOTEWITNESS = 0xd8;
  public static final int WITHDRAWREWARD = 0xd9;
  public static final int CREATE = 0xf0;
  public static final int CALL = 0xf1;
  public static final int CALLCODE = 0xf2;
  public static final int DELEGATECALL = 0xf4;
  public static final int STATICCALL = 0xfa;
  public static final int RETURN = 0xf3;
  public static final int CREATE2 = 0xf5;
  public static final int REVERT = 0xfd;
  public static final int SUICIDE = 0xff;
}
