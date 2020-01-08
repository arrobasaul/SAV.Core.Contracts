/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Services.ModuleServices;

/**
 *
 * @author savarela
 * @param <T>
 */
public interface IDataBroker<T extends Object> {
    public String getValue(int position);//return myData[position];
    public void setValue(int position, String value);//myData[position] = value;
    String Filename();
    
    void ChangeFileWithCopy(String filename);
    void LoadFromFile(String file);
    void SaveToFile();
    void SetData(String key, T value);
    void OverrideData(String key, T value);
    T GetData(String key);
    boolean RemoveData(String key);
}
