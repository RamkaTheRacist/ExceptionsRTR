package Exceptions.Sem03.HW.Core.Logic.Interfaces;

public interface IFactory {
    void makeOperations(String path, String choose, ICheckData checkData, IConsoleInput input, IErrors errors,
            ISave save, ISuccess suc);
}
