/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Metadata;

import java.lang.reflect.Type;

/**
 *
 * @author savarela
 */
public interface IServiceMetadata {
    Type[] Contracts ();
    String Descriptor ();
    boolean IsDefauldService ();
    boolean ForceSynchronism ();
    int Priority ();
}
