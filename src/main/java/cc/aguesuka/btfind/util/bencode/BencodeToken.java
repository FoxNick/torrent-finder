package cc.aguesuka.btfind.util.bencode;

/**
 * @author :aguesuka
 * 2019/9/3 17:23
 */
class BencodeToken {
    static final byte INT = 'i';
    static final byte DICT = 'd';
    static final byte END = 'e';
    static final byte LIST = 'l';
    static final byte SPLIT = ':';
}
