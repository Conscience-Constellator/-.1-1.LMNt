package CC.$.Q$Q_LMNt;

import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Meth_Rap.Try_Get_Meth;

public interface Q$Point<Out_Typ> extends Q$Q
{
	@Lin_DclAr @Neds_Ovrid(NEds=No)
	default Class<Out_Typ> Get_Out_Typ()
	{return (Class<Out_Typ>)Try_Get_Meth(getClass(),"Point_To_Point",Object.class).getReturnType();}
}